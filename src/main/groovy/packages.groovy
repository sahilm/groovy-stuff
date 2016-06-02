def clazzes = [String, List, File]
for (clazz in clazzes) {
    println clazz.package.name
}