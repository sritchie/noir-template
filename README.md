# noir-template

A Leiningen template for Noir projects making use of Heroku and Clojurescript.

## Usage

Run the following commands to install `noir-template` and create a new, custom koan project:

    lein plugin install lein-newnew 0.1.2
    lein plugin install noir-template 0.1.0
    lein new noir <your-project-name>
    cd <your-project-name>

The README of the resulting project will contain everything you need to know to get Clojurescript installed and get your server running.

## Customizing your new project

All new projects will require the following steps:

- add custom dependencies to `project.clj`. (Clojure defaults to 1.3.0, but feel free to roll back to 1.2.1 if you feel strongly about it..)
- Customize `README.md`

And that's it!

### License

The use and distribution terms for this software are covered by the
Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
which can be found in the file epl-v10.html at the root of this distribution.
By using this software in any fashion, you are agreeing to be bound by
the terms of this license.
