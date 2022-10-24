
java_binary(
    name = "ProjectRunner",
    srcs = ["src/main/java/com/example/ProjectRunner.java"],
    main_class = "com.example.ProjectRunner",
    deps = [":greeter"],
)

java_library(
    name = "greeter",
    srcs = ["src/main/java/com/example/Greeting.java"],
    deps = ["@fancy-text//src/java/com/engflow/fancytext:fancytext"],
    #visibility = ["@fancy-text//src/java/com/engflow/fancytext:private"]
)

#java_library(
 #   name = "fancy",
  #  srcs = ["fancy-text/src/java/com/engflow/fancytext/FancyFormatter.java"],
   # visibility = ["//fancy-text/src/main/java/com/enflow/fancytext:__subpackages__"],
    #deps = [],
#)