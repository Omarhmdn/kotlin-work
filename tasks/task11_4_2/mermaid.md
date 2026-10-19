# UML Class Diagram

Here is a UML class diagram, specified using [Mermaid][mer].

```mermaid
classDiagram
    class Customer {
        name
        address
        placeOrder()
    }
    class Order {
        orderNumber
        datePlaced
        deliveryDate
        checkStock()
        takePayment()
    }
    class OrderItem {
        name
        description
    }
    Customer -- Order : places
    Order -- OrderItem : includes
  note "Placeholder for a real class diagram"
```

[mer]: https://mermaid.js.org/
