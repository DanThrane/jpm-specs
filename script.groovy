import java.nio.file.Path
import java.nio.file.Files

def specs = new File("specs")
specs.mkdir()

Files.createFile(new File(specs, ".jpmspecsdir").toPath())

(0..9).each {
    def base = new File(specs, "$it")
    base.mkdir()
    Files.createFile(new File(base, ".jpmspecsdir").toPath())

    (0..9).each {
        def dir = new File(base, "$it")
        dir.mkdir()
        Files.createFile(new File(dir, ".jpmspecsdir").toPath())
    }

    ('a'..'z').each {
        def dir = new File(base, "$it")
        dir.mkdir()
        Files.createFile(new File(dir, ".jpmspecsdir").toPath())
    }
}

('a'..'z').each {
    def base = new File(specs, "$it")
    base.mkdir()
    Files.createFile(new File(base, ".jpmspecsdir").toPath())

    (0..9).each {
        def dir = new File(base, "$it")
        dir.mkdir()
        Files.createFile(new File(dir, ".jpmspecsdir").toPath())
    }

    ('a'..'z').each {
        def dir = new File(base, "$it")
        dir.mkdir()
        Files.createFile(new File(dir, ".jpmspecsdir").toPath())
    }
}
