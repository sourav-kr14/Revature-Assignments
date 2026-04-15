import { Link } from "react-router-dom";
export default function Navbar() {
  return (
    <nav>
      <h2>RevShop</h2>
      <div>
        <Link to="/">Home</Link>
        <Link to="/prodcucts">Products</Link>
        <Link to="/cart">Cart</Link>
      </div>
    </nav>
  );
}
