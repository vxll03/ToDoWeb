import styles from "./Button.module.scss";

export default function Button({ children, onClick, type }) {


  return (
    <button onClick={onClick} className={`${styles.button} ${type === "header" ? styles.header : ""}`}>
      {children}
    </button>
  );
}
