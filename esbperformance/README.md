Mule ESB 3.4 performance testing
===

Quick Start
-----------

- Jetty, mule-config.xml
- NIO http, mule-config-nio.xml

The not well-known ESB performance suite:
http://esbperformance.org/display/comparison/ESB+Performance+Testing+-+Round+6

nio http connector reference:
http://blog.callistaenterprise.se/2013/01/10/mule-esb-nio-http-transport-and-10000-websocket-clients/a


Enhancements and BUG FIXED:
--------------------------

* migrate mule config to flow
* ws-security invalid timestamp: update wss4j to 1.6.10 and xmlsec to 1.5.4
* change GC to -XX:+UseG1GC on Jdk7u17

colorzhang@gmail.com
April 13, 2013
