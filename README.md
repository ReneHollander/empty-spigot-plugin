empty-spigot-plugin
-------------------------------------------------
This is an empty Spigot plugin. It uses Gradle to make sure the correct version of Spigot is installed and available. It can also host a local testserver with the plugin automatically built and installed.

# Usage

## IntelliJ IDEA
- Clone repository
- Setup Worksapce
  - Windows:  
    - Open CMD
    - Navigate into cloned repository
    - Execute `gradlew.bat idea`
    - Execute `gradlew.bat build`
  - Linux/OSX
    - Open Terminal
    - Navigate into cloned repository
    - Execute `./gradlew idea`
    - Execute `./gradlew build`
- Open the project in IntelliJ by opening the created `.ipr` file. Otherwise the run configurations will not be in place for you!
- Make sure to click "Link Gradle Project" in the right upper corner after the first start to have Gradle working properly. Check the IntelliJ Event Log if you missed it.

## Eclipse (You can try to use it, but IDEA is better...)
- Clone repository
- Setup Worksapce
  - Windows:  
    - Open CMD
    - Navigate into cloned repository
    - Execute `gradlew.bat eclipse`
    - Execute `gradlew.bat build`
  - Linux/OSX
    - Open Terminal
    - Navigate into cloned repository
    - Execute `./gradlew eclipse`
    - Execute `./gradlew build`
- Open Eclipse
- If not by now, install a Eclipse Gradle integration plugin from the Marketplace
- Import the repository as a Gradle Project
- Define the Run configurations:
  - Click on the black arrow next to the green arrow in the top bar
  - Double click on Gradle configuration
    - Name one run config "Build Plugin" and assign it the "build" gradle task (Make sure there is no additional new line in the box!)
    - Name the other run config "Start Dev Server" and assign it the "startDevServer" gradle task (Make sure there is no additional new line in the box!)
  - Both run configs need a working directory. Click on Workspace next to the text field and select the name of the project you are currently working on
- Done!

## General
During setup some run configurations will be created for you:
- **Build Plugin**  
  Builds the plugin and copies it to the local testserver
- **Start Dev Server**  
  Starts the local testserver in the IDE. You can also debug the plugin by starting it with the little green bug next to the green play button. You can then set breakpoints and perform HotSwap (Shift+F9) during development so you don't have to rebuild the plugin and reload the server all the time.

## Changing spigot version or plugin name/version
You can change the Spigot version in the `gradle.properties` file. Next time you compile the plugin, the correct version of Spigot will be fetched and built for you.
```
apiversion=1.10.2-R0.1-SNAPSHOT // Version of the dependency
apibuildtoolversion=1.10.2 // Version of the dependency in the Spigot BuildTool (Normally Minecraft version number)
```

If you want to change the name or version of the plugin you need to check the following files:
- `gradle.properties`
- `settings.gradle`
- `plugin.yml`

This should be pretty straight forward...

Make sure to run the `clean/` task so that old artifacts don't interfere with the new version.

## Keeping server configurations
If you want to keep server configurations after a clean you can put any files into to `config/testserver/` directory. The files will automaticall be copied to the `testserver/` directory for you

# License
The MIT License (MIT)

Copyright (c) 2016 Rene Hollander and Contributors

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
