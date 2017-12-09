# Azure Java Functions Demo

## Requirements

* [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 1.8 and above
* [Maven](https://maven.apache.org/) 3.0 and above
* [.Net Core SDK](https://www.microsoft.com/net/download/)
* [Node](https://nodejs.org) 8.0 and above
* [Azure Functions Core Tool](https://www.npmjs.com/package/azure-functions-core-tools)
* [Azure Functions Remote Debugging Tool](https://www.npmjs.com/package/cloud-debug-tools)

## VS Code Setup

* Download and Install [VS Code](https://code.visualstudio.com/download)
* Install related extensions
  * [Azure Account](https://marketplace.visualstudio.com/items?itemName=ms-vscode.azure-account)
  * [Azure Functions](https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-azurefunctions)
  * [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)
  * [Language Support for Java](https://marketplace.visualstudio.com/items?itemName=ms-redhat.java)
  * [Java Test Runner](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test)
  * [REST Client](https://marketplace.visualstudio.com/items?itemName=humao.rest-client)

## Run JUnit Test

1. Open the FunctionTest.java file in test folder and click the Run Test | Debug Test option. 

## Run and Debug Functions Locally

1. Press F5 (using the local debug configuration in launch.json with port 5005). 
2. Open the Scratchpad.http file in .vscode folder, and send the request to localhost.
3. Set up breakpoint in Function.java and send the request again. 
4. Detach the debugger and stop the local runtime.

## Deploy to Azure

1. Use the Azure Functions Extension to deploy the current project to Azure. 
2. Once the deployment is done, send the request to remote endpoint to verify the result. 

## Remote Debugging

1. Start the debug tool by running dbgproxy in terminal.
2. Set breakpoint, attach to localhost port 8898.
3. Send request to remote endpoint and start remote debugging.

