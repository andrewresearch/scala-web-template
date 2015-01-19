## scala-web-template

This is a template project for web applications. In particular, utility or analysis webapps. It uses spring-boot with all server code written in Scala, and all client code in Javascript using AngularJS.

I've attempted to create a clear flexible structure that is easy to adapt for basic use.

# the front end

The front end is a tabbed view that is extendable, with each tab being handled by a directive, and server data for that directive handled by a controller. The template tab is called ``feature one` and all files required are in the `feature-one` directory including: `feature-one-directive.js`, `feature-one-controller.js`, `feature-one.html`, `feature-one.css`. These primary feature directories are at the topic level of the static directory.

Re-useable components (such as graphs and charts or common directives used througout) can be found in the `components` directory, and they follow the same naming convention as the features.

> Note: I haven't included the AngularJS file, the Angular-ui file or the Bootstrap files in this GitHub repo. You can either download and add them to the `libs` directory, or change the links in `index.html` to load the CDN versions.

# the back end

I've included enough files for a working jar to be built, with mongodb localhost access included, and the option to add spring security by uncommenting the appropriate line in the gradle build file. This project is set up to build with gradle, but could easily be changed to maven if that is what you prefer.

# further functionality

As I require further starting functionality for the webapps I'm building, I'll try and update the template to include that functionality. If you have suggestions to improve the template, please let me know, or alternatively fork this repository and create a pull request with your suggested changes.

I hope this makes your life a little easier, Andrew. :-)
