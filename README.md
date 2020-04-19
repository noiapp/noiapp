# Noi App

This project aims to create a contact tracing mobile based on the [DP-3T](https://github.com/DP-3T) standard, specifically aimed to the italian population.

This standard is designed to be privacy respectful and does not share informations, except anonymized data for volontary disclosure by people who find themself infected.

Those data can then be checked by the app to verify if you were in contact with someone infected.

The application will  be a React Native application including as modules the DP-3T sdk.


## Background

Disclaimer: if you find any incorrect information please file an issue to let us provide correct informations.


An "official" italian app is supposed to be being developed, although the status is unknown. What is known is that:

- a private company in Italy was selected to develop the application.
- we explicitly asked about the release of the source code but no answer has been given.
- this company is member of the PPPT-DP organization and it has been disclosed the app will use the PPPT-DT standard.
- the PPPT-DP organization it an invite-only organization.  At the moment no public source code has been yet released, although they declare the code to be Mozilla licensed.
- The standard PPPT-DP also is designed to include a centralized control of the contact informations.
- In the last few days the relationship among PPPT-DP and DP-3T went awry, as any reference to DP-3T was removed to PPPT-DP.

## Rationale

For those reasons whatever is the outcome of the development of the 'official' app, we believe it is required another app with  those goals:

- developed as an opensource project
- community oriented, without any relationship with private organizations
- using the "alternative" standard D3PT (decentralized) as opposed to the PPPT-DP (centralised) standard

This is the main repository of this app.



