# Overview

This project rides on [Noir](https://github.com/ibdknox/noir), a framework for writing web applications in Clojure.

It also uses the wonderful [ClojureScript](https://github.com/clojure/clojurescript) project which is a compiler for Clojure that emits JavaScript code! For bonus points it's also compatible with the with the advanced compilation mode of [Google Closure](http://code.google.com/closure) optimizing compiler. 

# Getting Started

To get started, you'll need to install a few tools, but it's painless.

* {{name}} (this project)
* Leiningen (Build tool for clojure, located [on github](https://github.com/technomancy/leiningen) )
* ClojureScript
* [cljs-watch](https://github.com/ibdknox/cljs-watch)

## {{name}}

Fire up your command line and:

```bash
    git clone INSERT_YOUR_GITHUB_REPO_HERE
    cd {{name}}
```

## Leiningen

Next install Leiningen, the build tool for Clojure. These instructions are copied from the Leiningen README:

* [Download this script](https://raw.github.com/technomancy/leiningen/stable/bin/lein) which is named `lein`
* Place it on your path so that you can execute it. (I like to use `~/bin`)
* Set it to be executable. (`chmod 755 ~/bin/lein`)

## ClojureScript

Next install ClojureScript. Pick a root directory (`rootdir`) where you want clojureScript to live and run the following commands:

```bash
    cd {{name}} # from above
    sh bootstrap.sh /path/to/rootdir
```

And then just follow the instructions at the end of the install.

## cljs-watch

Next install cljs-watch. This is a small script that watches your source directory for changes to clojureScript files. When it sees a change, it recompiles everything for live updates. Change your source, reload the browser, and you're set! The install is the same as for leiningen, just with a different script:

* [Download the script](https://github.com/ibdknox/cljs-watch/blob/master/cljs-watch) which is named `cljs-watch`.
* Place it on your path. (I like to use `~/bin`)
* Set it to be executable. (`chmod 755 ~/bin/cljs-watch`)

# Usage

Use two terminals. In the first:

```bash
    cd {{name}}
    lein deps
    lein ring server    
```

And in the second:

```bash
    cd {{name}}
    cljs-watch
```

Access [127.0.0.1:3000](127.0.0.1:3000) and your golden!

# License

Copyright © 2011 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
