def getNextStop[T] (stopsList: Array[T], prevStop: Int) : Int = {

  ((prevStop + 1) % (stopsList.length-1))
}

def isStopSame[T](in: T, in2: T) : Boolean = {
  in == in2
}

getNextStop(Array(7, 6, 3, 1), 1)

var stops = Array("Canning Town", "East Ham", "West Ham", "Stratford")

var stopsTwo = Array("Massage Palour", "East Ham", "McDonalds", "Club")
var stopNumber = 13

stops(getNextStop(stops, stopNumber))
stopsTwo(getNextStop(stopsTwo, stopNumber))

getNextStop(stops, stopNumber)
getNextStop(stopsTwo, stopNumber)

isStopSame(getNextStop(stops, stopNumber), getNextStop(stopsTwo, stopNumber))
isStopSame(stops(getNextStop(stops, stopNumber)), stopsTwo(getNextStop(stopsTwo, stopNumber)))


