Mule ESB 3.4 performance testing
1) Jetty, mule-config.xml
2) NIO http, mule-config-nio.xml

The not well-known ESB performance suite:
http://esbperformance.org/display/comparison/ESB+Performance+Testing+-+Round+6

nio http connector reference:
http://blog.callistaenterprise.se/2013/01/10/mule-esb-nio-http-transport-and-10000-websocket-clients/a


Enhancements and BUG FIXED:

1) migrate mule config to flow
2) ws-security invalid timestamp: update wss4j to 1.6.10 and xmlsec to 1.5.4
3) change GC to -XX:+UseG1GC on Jdk7u17

colorzhang@gmail.com
April 13, 2013
