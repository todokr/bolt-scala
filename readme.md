# Bolt Scala Example

A [Bolt for Java](https://slack.dev/java-slack-sdk/guides/getting-started-with-bolt) app example, building as executable binary with [GraalVM native-image](https://www.graalvm.org/docs/reference-manual/native-image/).  


## How to build

1. Setup [native-image build environment](https://sbt-native-packager.readthedocs.io/en/stable/formats/graalvm-native-image.html).
1. Run `graalvm-native-image:packageBin`
1. Execute `./target/graalvm-native-image/bolt-scala`
