package com.semana.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.semana.dsmeta.entities.Sale;
import com.semana.dsmeta.repositories.SaleRepository;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class SmsService {
	@Value("${twilio.sid}")
	private String twilioSid;

	@Value("${twilio.key}")
	private String twilioKey;

	@Value("${twilio.phone.from}")
	private String twilioPhoneFrom;

	@Value("${twilio.phone.to}")
	private String twilioPhoneTo;

	@Autowired
	private SaleRepository repository;
	
	public void sendSms(Long id) {
		
		Sale sale = repository.findById(id).get();
		
		String date = sale.getDate().getMonthValue()+"/"+sale.getDate().getYear();
		
		String sms = "Vendedor " + sale.getSallerName()+" foi destaque em "+date
				+ " com um total de R$" + String.format("%.2f", sale.getAmount());
		
		Twilio.init(twilioSid, twilioKey);

		PhoneNumber to = new PhoneNumber(twilioPhoneTo);
		PhoneNumber from = new PhoneNumber(twilioPhoneFrom);

		Message message = Message.creator(to, from, sms).create();

		System.out.println(message.getSid());
	}
}
