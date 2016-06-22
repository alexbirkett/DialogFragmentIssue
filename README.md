# DialogFragmentIssue
Demonstrates that an animation is run when layout changes occur in a dialog fragment

# Description of problem

When one `ViewGroup` hosted in a `DialogFragment` is set to `VISIBLE` and another set to `GONE` an animation runs. The dialog disappears then slides in from the lower right of the screen. The same animation does not run when the dialog is first opened.


[YouTube video of app](https://www.youtube.com/watch?v=qDoJkpjsfHM&feature=youtu.be)
