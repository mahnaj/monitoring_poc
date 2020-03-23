# Monitoring POC

The objective of this POC is to use the ELK stack in order to produce logs and use them for monitoring purposes, as illustrated in following preview:
![preview](/images/elk.png)


Note that we used Docker images for ELK stack (ElasticSearch, Logstash, Kibana).

## Preview of result using Kibana

Applicative logs are pushed to elastic in the following json structure, according to LogModel class:
    
    {
	    "appName":"Data Certification", 
	    "component":"Files Watcher", 
	    "env":"DEV", 
	    "message":"Error#08", 
    }  
   
Once created, logs can be visualized in Kibana in dashboards.

Kibana provides a query tool that allows to list data according to selected criteria/filters.

For instance, following dashboards were created by filtering on Level, LoggerName and log message. 

![dashboard](/images/preview_kibana.jpg)





