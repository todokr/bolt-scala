# Bolt Scala Example

A sample slack bot app implementation with [Slack SDK for Java](https://slack.dev/java-slack-sdk/).

## How to build

1. Setup [native-image build environment](https://sbt-native-packager.readthedocs.io/en/stable/formats/graalvm-native-image.html).
1. Run `graalvm-native-image:packageBin`
1. Execute `./target/graalvm-native-image/bolt-scala`
