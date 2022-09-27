import 'package:client/pages/doctor/homepage.dart';
import 'package:client/pages/patient/homepage.dart';
import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  @override
  _HomePageState createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: const Text("HomePage"), centerTitle: true),
        body: Center(
            child: Wrap(spacing: 20, runSpacing: 20, children: <Widget>[
          //button("Patient", PatientHomePage()),
          //SizedBox(
          //  height: 20,
          //),
          button("Doctor", DoctorHomePage()),
          button("Patient", PatientHomePage()),
          // button("Temp Management", DoctorHomePage()),
        ])));
  }

  Widget button(String text, Widget widget) {
    return ElevatedButton(
      onPressed: () {
        Navigator.push(
          context,
          MaterialPageRoute(builder: (context) => widget),
        );
      },
      child: Text(text),
    );
  }
}
