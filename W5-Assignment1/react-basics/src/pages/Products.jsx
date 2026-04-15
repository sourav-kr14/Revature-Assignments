import ProductCard from "../components/ProductCard";
import { products } from "../data/products";
export default function Product() {
  return (
    <div>
      <h1>Products</h1>
      <div>
        {products.map((product) => (
          <ProductCard key={product.id} product={product} />
        ))}
      </div>
    </div>
  );
}
