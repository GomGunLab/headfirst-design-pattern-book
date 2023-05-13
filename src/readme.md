# facrtory method

모든 팩토리 패턴은 객체 생성을 캡슐화한다. 팩토리 메소드 패턴은 서브클래스에서 어떤 클래스를 만들지를 결정함으로써 객체 생성을 캡슐화한다.

# 이해가 잘 안가는 부분

```java
public class PizzaStore {
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(String type) {
        Pizza pizza;
        
        pizza = factory.createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
```

위의 `SimplePizzaFactory`를 사용한 방법과 아래의 팩토리 메서드 패턴을 사용한 방법은 다른데 무엇이 다른지를 정확히 모르겠다.

```java
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
```
**책에서 제공한 설명**

**Q** 간단한 팩토리와 팩토리 메서드 패턴의 차이를 아직 잘 모르겠어요. 팩토리 메서드 패턴에서 피자를 리턴하는 클래스가 서브 클래스라는 점을 빼면 거의 같잖아요. 좀 더 자세히 설명해 주실 수 있나요?

**A** 맞습니다. 팩토리 메서드 패턴이 간단한 팩토리와 상당히 비슷합니다. 하지만 간단한 팩토리는 일회용 처방에 불과한 반면, 팩토리 메서드 패턴을 사용하면 여러 번 재사용이 가능한 프레임워크를 만들 수 있습니다. 예를 들어, 팩토리 메서드 패턴의 orderPizza() 메서드는 피자를 만드는 일반적인 프레임워크를 제공합니다. 그 프레임워크는 팩토리 메서드 피자 생성 구상(concrete) 클래스를 만들었죠. PizzaStore 클래스의 서브 클래스를 만들 때, 어떤 구상 제품 클래스에서 리턴할 피자를 만들지를 결정합니다. 이 프레임워크를 간단한 팩토리와 한번 비교해 보세요. 간단한 팩토리는 객체 생성을 캡슐화하는 방법을 사용하긴 하지만 팩토리 메서드만큼 유연하지는 않습니다. 생성하는 제품을 마음대로 변경할 수 없기 때문이죠