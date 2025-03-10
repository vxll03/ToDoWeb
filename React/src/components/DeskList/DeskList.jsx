import styles from "./DeskList.module.scss";

import Desk from "../Desk/Desk";
import fetchData from "../../httpGet";

import { useEffect, useState } from "react";

export default function DeskList() {
  const [desksList, setDesksList] = useState([]);

  useEffect(() => {
    const data = fetchData("/desks");

    data.then((value) => {
      setDesksList(value);
    });
  }, []);

  return (
      <div className={styles.deskList}>
        {desksList.map((desk) => (
            <Desk key={desk.id} {...desk} />
        ))}
      </div>
  );
}
