# Cimple - a simple c like language

This repository contains an interpreter for Cimple. Cimple is a simple c like language, which I created so that I can experiment with language applications development. The final outcome of should be following:

- [x] Antlr4 grammar describing the language
- [x] Generated lexer and parser
- [ ] Handcrafted lexer and parser -> For both exercise and better error messages
- [x] Heterogenous AST for the language
- [x] Generic visitors and listeners for AST rewriting
- [x] Basic semantical analysis(just checking that variables exist and functions are called with proper amount of parameters)
- [ ] Simple type system
- [x] Tree walking interpreter
- [ ] Bytecode interpreter
- [ ] Visitor generating LLVM code
- [ ] Refactoring and code analysis algorithms -> For IDE support

As you can see, some things have been done already, but there is a lot more that I'd like to implement in the future :)
