addSbtPlugin("com.julianpeeters" % "sbt-plugin-example" % "0.1.1-SNAPSHOT")

resolvers += Resolver.file("Local Ivy Repository", file("/home/julianpeeters/.ivy2/local/"))(Resolver.ivyStylePatterns)
