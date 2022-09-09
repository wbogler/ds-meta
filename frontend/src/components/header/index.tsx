import logo from '../../assets/img/logo.svg'
import './style.css'

function HeaderCab() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSmeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por 
                    <a href="https://boglerwillian.netlify.app/">Willian Bogler</a>
                </p>
                <p>
                Refência: 
                    <a href="www.devsuperior.com">DevSuperior</a>
                </p>
            </div>
        </header>
    )
}
export default HeaderCab