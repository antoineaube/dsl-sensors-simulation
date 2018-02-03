laws {
    law 'temperature law' is replay('sample/day.json') {
        fetch 'temperature' whose values are Integer

        times in 't'
        values in 'v'
        sensors in 's'
    }
}

simulation {
    lot ('School') {
        contains 3 sensors 'temperature' following 'temperature law' with {
            offset 1.year
            noise 1..10
        }
    }
}