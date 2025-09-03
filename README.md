# java-shell

This is a simple shell implemented in Java as part of the [Codecrafters "Build Your Own Shell" challenge](https://codecrafters.io/challenges/shell).

## Features

- Built-in commands: `exit`, `echo`, `type`
- Searches for executables in `PATH` (with Windows `PATHEXT` support)
- Shows executable path for external commands
- Graceful error handling

## Usage

Clone the repository and compile the code:

```bash
git clone https://github.com/omarriyad1/java-shell.git
cd java-shell
javac Main.java
java Main
```

Example usage:

```
$ echo Hello World
Hello World

$ type java
java is /usr/bin/java

$ exit
```

## License

MIT
