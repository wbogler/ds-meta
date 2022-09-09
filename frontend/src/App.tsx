import HeaderCab from "./components/header"
import SalesCard from "./components/salesCard"
import NotificationButton from "./components/notificationButton"

function App() {
  return (
    <>
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
