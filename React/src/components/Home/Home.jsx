import Desk from "../Desk/Desk.jsx";

export default function Home() {
  return (
    <section className="home_section">
      <ul className="desk_list">
        <li>
          <Desk />
        </li>
      </ul>
    </section>
  );
}
