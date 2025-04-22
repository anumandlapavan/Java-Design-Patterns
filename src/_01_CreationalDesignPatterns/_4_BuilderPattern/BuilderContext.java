package _01_CreationalDesignPatterns._4_BuilderPattern;

class BuilderContext {
    Builder builder;

    BuilderContext(Builder builder) {
        this.builder = builder;
    }

    public Student btechCseStudent() {
        return this.builder.setCourse("BTech").setBranch("CSE").studentBuild();
    }

    public Student mtechCseStudent() {
        return this.builder.setCourse("MTEch").setBranch("CSE").studentBuild();
    }
}
