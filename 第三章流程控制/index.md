### switch 注意事项

switch 关键字，表示 switch 分支。
表达式 对应一个值。该值必须是 int 或 char（char 可以转化为 int）。是 byte 或 short 的场合，要提升为 int。不允许 long、double 或 float
case 常量 1; 表示：当 表达式 的值等于 常量 1 ，则执行 语句块 1。
break; 表示退出 switch 分支。
当 表达式 的值匹配 常量 1 ，则执行 语句块 1，如果不匹配，则继续匹配 常量 2 ，以此类推。
如果全都不匹配，则执行 default。
如果不写 break; ，则会发生穿透，即不进行判断而继续执行下一语句块。
