import DeskList from "../DeskList/DeskList.jsx";

export default function Home() {
  return (
    <section className="home_section">
      <ul className="desk_list">
        <li>
          <DeskList />
        </li>
      </ul>
    </section>
  );
}
