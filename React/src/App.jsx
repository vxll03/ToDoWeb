import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Header from "./components/Header/Header.jsx";
import Home from "./components/Home/Home.jsx";

function App() {
  return (
    <Router>
      <Header />

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/profile/:id" element={<h1>Profile</h1>} />
      </Routes>
    </Router>
  );
}

export default App;
