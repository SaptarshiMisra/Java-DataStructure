# Factory pattern uses few actors
* **Creator**: Abstract class : `Dialog.java`
    * **The creator** class declares the factory method that must return an object of a product class. The creator's subclasses usually provide the implementation of this method.
    * **One Product** : This is the thing the creator creates. for example `createButton():Button` within `Dialog` class

* **Concrete creators**: override the factory method to change the
    * `WindowsDialog.java`
    * `LinuxDialog.java`

* **product interface** : Declares the operations that all concrete products must implement. 
    * `Button.java`

* **Concrete products**: provide various implementations of the product interface.
    * `WindowsButton.java`
    * `LinuxButton.java`