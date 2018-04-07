# Project Architectures

Some example of simple implementations of architectures.

## Layered
* The packages or projects are stacked;
* The dependency/communication flows from top layer to bottom layer;
* Example:
  * Presentation (WS, Rest API or web controllers)
  * Application Services
  * Infrascruture (Datase)
  * Domain (services and models)

## Onion/Hexagonal
* The packages or projects are layered literally like an onion =)
* The dependency/communication flows from outer layer to inner layaer:
  * Presentation -> Application -> Domain
  * The Application layer declares interfaces (Port) to outer layer's components implement (Adapters);
  * The Application layer use the Ports to send message to outer layers.
* Example:
  * Outer layers: Presentation, Infrastructure
  * Middle layer: Application Services
  * Inner layers: Domain (services and models)
* To visualize:
  * [Simple example from Tidy Java](http://tidyjava.com/wp-content/uploads/2017/02/kolka-768x768.png)
  * [Full example from Herberto](https://herbertograca.files.wordpress.com/2018/11/100-explicit-architecture-svg.png?w=1200)


## Links
* [Best post](https://herbertograca.com/2017/11/16/explicit-architecture-01-ddd-hexagonal-onion-clean-cqrs-how-i-put-it-all-together)
