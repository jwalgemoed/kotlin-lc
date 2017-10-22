package nl.sourcelabs.examples

// Regular class with overrides for toString, hashCode and Equals
class NormalClass(val name: String, val count: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NormalClass

        if (name != other.name) return false
        if (count != other.count) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + count
        return result
    }

    override fun toString(): String {
        return "NormalClass(name='$name', count=$count)"
    }

    fun copy(name: String = this.name, count: Int = this.count): NormalClass {
        return NormalClass(name, count)
    }
}

// Same as a regular class but with predefined toString, equals, hashcode and copy
data class NormalDataClass(val name: String, val count: Int)