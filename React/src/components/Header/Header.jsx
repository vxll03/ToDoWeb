import styles from "./Header.module.scss";
import { Link } from "react-router-dom";
import Button from "../Button/Button.jsx";

import vite from "../../../public/vite.svg";
import user from "../../assets/profile.png";
import home from "../../assets/home.png";

export default function Header() {
  return (
    <header className={styles.header}>
      <img src={vite} alt="logo" className={styles.logo} />

      <nav className={styles.nav}>
        <Link to="/">
          <Button type="header">
            <img src={home} alt="Home" />
            <p>Home</p>
          </Button>
        </Link>
        <Link to="/profile/:id">
          <Button type="header">
            <img src={user} alt="Profile" />
            <p>Profile</p>
          </Button>
        </Link>
      </nav>
    </header>
  );
}
