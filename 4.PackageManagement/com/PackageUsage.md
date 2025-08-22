// 该文件用于说明如何使用包管理机制。

// 包是什么：在 Java 中，包（Package）是组织类和管理命名空间的核心机制，而正确的编译和运行命令则是确保程序正常工作的基础。

// 包的作用：代码组织和管理、控制访问权限、避免类名冲突

// 包的使用：
- 命名规范：通常使用反转的域名（全部小写），如com.company.project

- 目录对应：包名必须与文件系统的目录结构完全一致
    例如package com.example.shapes;对应的文件必须放在com/example/shapes目录下

- 声明位置：package语句必须是 Java 文件的第一行有效代码（注释除外）

使用示例：

myproject/                # 项目根目录
└── com/
    └── example/
        ├── Main.java     # 属于com.example包
        └── shapes/       # 子包
            ├── Circle.java   # 属于com.example.shapes包
            └── Rectangle.java # 属于com.example.shapes包

在这个目录结构中，必须从项目根目录（myproject 目录）执行运行命令，这是 Java 包机制和类加载机制的要求。

具体解释：
    目录结构与包名的对应关系
    你的项目根目录是 myproject
    com/example/Main.java 对应包 com.example，类名为 Main
    com/example/shapes/Circle.java 对应包 com.example.shapes，类名为 Circle
    这种对应关系可以理解为：包名 = 项目根目录后的目录路径（将 / 替换为 .）


运行命令的正确位置
    必须在 myproject 目录下执行命令
    运行命令格式：java 完整类名（包名 + 类名）


为什么必须从根目录运行？
    Java 虚拟机（JVM）需要通过 完整类名 查找对应的 .class 文件
    当你执行 java com.example.Main 时，JVM 会在当前目录下寻找：./com/example/Main.class
    如果不在根目录（myproject）运行，JVM 会找不到正确的目录结构

    可以把项目根目录想象成 "书架"，com/example 这些目录是 "书架上的格子"，类文件是 "格子里的书"。
    当你想让别人找一本书时，你会说："在书架的 com 格子 → example 格子里，有一本叫 Main 的书"，而不是直接说 "在 example 格子里有本书"。
    Java 运行命令也是同样的道理，必须从 "书架"（根目录）开始，通过完整路径（包名 + 类名）查找类。

    总结：所有编译和运行命令都必须在项目根目录（myproject）下执行，这样 Java 才能正确识别包结构和类的位置。
