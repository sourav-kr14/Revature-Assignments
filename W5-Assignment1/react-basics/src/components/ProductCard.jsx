import { useState } from "react";

export default function ProductCard({ product }) {
  const [added, setAdded] = useState(false);
  const lowStock = product.stock < 5 && product.stock > 0;
  const outOfStock = product.stock === 0;
  return (
    <div
      className={`${lowStock ? "lowStock" : ""}${outOfStock ? "stock-out" : ""}`}
    >
      <img src={product.image} alt={product.name} />
      <h2>{product.name}</h2>
      <p>Category: {product.category}</p>
      <p>Price: {product.price}</p>
      <p>Stock:{product.stock}</p>
      <p>
        Status :{" "}
        {outOfStock ? "Product is out of stock" : "Product is in stock"}
      </p>
      {lowStock && <p>Hurry up only few items left</p>}
      <button disabled={outOfStock} onClick={() => setAdded(true)}>
        {outOfStock ? "Product Unavailable" : added ? "Added" : "Add to cart"}
      </button>
    </div>
  );
}
