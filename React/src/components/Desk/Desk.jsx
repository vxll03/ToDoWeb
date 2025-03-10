import styles from "./Desk.module.scss";
import fetchData from "../../httpGet";
import { useEffect, useState } from "react";

export default function Desk() {
  const [desksList, setDesksList] = useState([]);

  useEffect(() => {
    const data = fetchData("/desks");

    data.then((value) => {
      setDesksList(value);
      console.log(value);
    });
    console.log(desksList);
  }, []);

  return (
    <div className={styles.desk}>
      <h1 className={styles.desk_name}></h1>
    </div>
  );
}
