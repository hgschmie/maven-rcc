A simple driver for Hadoop RCC to not exit when successfully executed.
Very annoying with the maven exec plugin.

Usage:

    <plugin>
      <groupId>org.codehaus.mojo</groupId>
      <artifactId>exec-maven-plugin</artifactId>
      <version>1.2.1</version>
      <dependencies>
        <dependency>
          <groupId>de.softwareforge.tools</groupId>
          <artifactId>maven-rcc</artifactId>
          <version>1.0</version>
        </dependency>
      </dependencies>
      <executions>
        <execution>
          <phase>generate-sources</phase>
          <configuration>
            <includePluginDependencies>true</includePluginDependencies>
            <mainClass>de.softwareforge.tools.MavenRcc</mainClass>
            <arguments>
              <argument>-l</argument>
              <argument>java</argument>
              <argument>-d</argument>
              <argument>${project.basedir}/target/generated-sources/rcc</argument>
              <argument>${project.basedir}/src/main/rcc/... jr files ...</argument>
            </arguments>
          </configuration>
          <goals>
            <goal>java</goal>
          </goals>
        </execution>
      </executions>
    </plugin>
