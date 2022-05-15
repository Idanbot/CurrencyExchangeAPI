# CurrencyExchangeAPI
Currency Exchange API written in Spring Boot

Uses external service to get currency rates for the given 3 letter currency code (ISO 4217) valid for the day of the request.

Endpoint - /money/convert
  params: ?from="CODE1"&to="CODE2"&amount="AMOUNT"
  
Response is in JSON:
```
{
  "fromCurrency" : "string",
   "toCurrency" : "string",
   "amount" : number,
   "result" : number
}
```
   
Cache system is implemented in Redis, more information about this API can be found in Swagger-UI.

# Prerequisites
## Setting redis on docker
```
docker pull redis
docker run --name excache -p 6379:6379 -d redis
```
