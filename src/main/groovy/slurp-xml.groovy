def customers = new XmlSlurper().parse(this.getClass().getResourceAsStream('customers.xml'))
for (customer in customers.corporate.customer) {
    println "${customer.@name} works for ${customer.@company}"
}
