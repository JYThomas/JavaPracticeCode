// Java 编译（javac）和运行（java）命令

# 编译命令：
- javac 类名.java / javac 源文件路径/文件名.java

# 编译单个文件
javac com/example/shapes/Circle.java

# 编译多个文件
javac com/example/shapes/Circle.java com/example/Main.java

# 编译整个包（使用通配符）
javac com/example/shapes/*.java com/example/*.java

注意：必须从包的根目录（myproject）执行编译命令，编译路径要与包结构一致，如果类之间有依赖关系，需要确保所有依赖的类都被编译



# 运行命令：
- java 完整类名（包名 + 类名） / java 类名（当前目录）

# 运行单个类
java com.example.shapes.Circle

# 运行多个类
java com.example.shapes.Circle com.example.Main

# 运行整个包
java com.example.shapes

注意：必须使用完整类名（包名 + 类名），不能带.class后缀，必须从包的根目录执行运行命令，确保所有依赖的类都已编译并在类路径中