# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.cloudmersive</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>2.0.3</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.cloudmersive:swagger-android-client:2.0.3"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-2.0.3.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.cloudmersive.client.ScanApi;

public class ScanApiExample {

    public static void main(String[] args) {
        ScanApi apiInstance = new ScanApi();
        File inputFile = new File("/path/to/file.txt"); // File | Input file to perform the operation on.
        try {
            VirusScanResult result = apiInstance.scanFile(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi#scanFile");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.cloudmersive.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ScanApi* | [**scanFile**](docs/ScanApi.md#scanFile) | **POST** /virus/scan/file | Scan a file for viruses


## Documentation for Models

 - [VirusFound](docs/VirusFound.md)
 - [VirusScanResult](docs/VirusScanResult.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### Apikey

- **Type**: API key
- **API key parameter name**: Apikey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



