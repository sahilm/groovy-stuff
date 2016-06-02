def number = 0
new File(this.getClass().getResource('/data.txt').getPath()).eachLine { line ->
    number++
    println "$number: $line"
}
