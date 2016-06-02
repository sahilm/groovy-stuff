def urls = [
        'http://www.groovy-lang.org',
        'http://gpars.codehaus.org',
        'http://gr8conf.org'
]*.toURL()

println(urls.collect {
    it.text.findAll(~/[Gg]roovy/).size()
})
