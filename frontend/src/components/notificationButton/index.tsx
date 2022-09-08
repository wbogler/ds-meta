import icon from '../../assets/img/NotificationIcon.png'
import './style.css'

function NotificationButton() {
    return (
        <div className = "dsmeta-red-btn">
            <img src={icon} alt="Notificar"/>
        </div>
    )
}

export default NotificationButton