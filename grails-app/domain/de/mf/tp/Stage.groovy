package de.mf.tp

class Stage {
	
	Day day
	Date time
	Address address
	String name
	String notes
	String shortdesc
	long staySeconds
	Long distance

    static constraints = {
		name nullable:false, blank:false
		address()
		day()
		time(attributes:['precision':'minute'])
		notes()
		shortdesc()
		staySeconds()
		distance()
    }
	
	static searchable = true
	
	static mapping = {
		version false
		table name:'stage'
		id column:'stage_id', generator:'sequence', params:[sequence:'stage_seq', initialValue:1]
		notes type:'text'
		time type:'timestamp'
	}
	
	String toString() {
		name
	}
	
}
