The application is a web app that digest a json api in order to search for hotel deals.
The applications uses java server pages for the front end and java for the back end.

The front end is composed of one page, showing a detailed search area below which the list of deals is being shown.
The list criteria includes all the parameters listed in the api.
A simple validation and basic design is implemnted in the page.

The back end is composed of three packages:
the view which contains the managed bean linking to all attributes of the web page.
the controller which uses the visiter pattern to update the list of deals after a search is executed. 
The controller calls the search from the data service which in our case prepares the url with the serach params and then calls json parser
to generate pojos from it. What we could do later is add an interface and extend it with different data services.

The list of pojos used in the code has been generated using http://www.jsonschema2pojo.org/

A couple of test cases has been implemented using JUnit, as well as a thourough testing from the webpage it self.

