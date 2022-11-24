# Contribution guidelines: 

## Notes:
- Each PR should have only one featured pattern as an example on a new branch.
- PR commits should be in the shape of `feature-to-add: files changes`.
- Each featured-pattern should be in a **separate runnable project** and has an **additional github-md** (markdown) file to demonstrate the following: 
  1) The usages of the pattern.
  2) The UML paradigm of the pattern.
  3) Tweaks of the pattern.
  4) Other languages implementation if possible.

## Steps to contribute (Create a PR): 
1) Fork this repository.
2) Clone this repository locally on your disk via the git-client-side: 
```bash
$ mkdir ./Design-Patterns && cd ./Design-Patterns && git clone https://github.com/your-user-name/Design-Patterns.git
```
3) Create a new featured branch off the master branch: 
```bash
$ git branch master -b 'featured-branch'
```
4) Do your changes.
5) Add the files and commit the changes, be sure to make meaningful adds and commits messages as far as you can as we previously mentioned in this shape (`feature-to-add: files changes`): 
```bash
$ git add ./[files-to-add] && git commit -m 'feature-to-add: files changes'
```
6) Push changes: 
```bash
$ git push origin featured-branch
```
7) Create a PR with a good title and description in the shape of `Feature-added: little description`.

## Steps to update with the remote:
1) To avoid conflicts, any changes proposed should be on a new branch on your fork if the original feature branch is outdated.
2) To update with a branch use the following command: 
```bash
$ cd ./Design-Patterns && git checkout [branch-name] && git pull origin [branch-name]
```
