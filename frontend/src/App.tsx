import HeaderCab from "./components/header"
import SalesCard from "./components/salesCard"
import NotificationButton from "./components/notificationButton"
import { ToastContainer } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

function App() {
  return (
    <>
      <ToastContainer />
      <HeaderCab />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />

          </div>
        </section>
      </main>

    </>
  )
}

export default App
