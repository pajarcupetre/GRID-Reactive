#GRID-REACTIVE

Project to get all the tweets from last 7 days for the projects that are matching a query string passed from application.conf  

Structure:
  - 
Sbt project with:  
src/main/resources 
 - application.conf contains details about github query and twitter query  
 -  twitter_setup.conf  
        contains twitter authetifaction details  
        twitter {  
          api_key=xxxxxx  
          secret_key=xxxxx  
        }
        
src/main/scala  
  - contains source code of the applications
 
src/test/scala  
  - application tests
  
src/test/resources
  - application.conf for tests and example jsons
  
How to run:
-

**sbt run** will offer you options:  
[1] com.grid.reactive.GithubProjectSearchRunner  
[2] com.grid.reactive.Main  
[3] com.grid.reactive.TwitterSearchRunner  

select **2** to run all project as designed.  
GithubProjectSearchRunner will output json for spark string.  
TwitterSearchRunner will output json for spark from twitter. 
These two are helpul object for fast testing.

Run tests:
- 
sbt test
