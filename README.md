# proyecto-base-serenity-bdd-screenplay-image-comparaction

## Image Comparison
### About:
This is a library available to perform absolute comparison tests between images. Note that the concept of absolute comparison is based on the evaluation of pixel-by-pixel values between the images involved, which brings limitations to the testing, however, it provides a perfect use for test images.
### Source
https://github.com/romankh3/image-comparison
### Use of archetype and image comparison classes
To use this implementation in your projects, you need to create the following folders:
1. create this path : /resources/data/screenshot - in this route you will be able to save the screenshot took by utility class called *ScreenshotProvider*.
2. in  /resources/data/ : in this path you will be able to save your image to test the scenarios in *compare_image.feature*
3. You need to create this path : /resources/results - to save the results of image comparison Task 

## ✅ Technologies
### This project required:
- [JDK java] version 1.8
- [Serenity] version 2.3.8
- [Gradle] version

## Project status
<h4 align="center"> 🚧 Proyecto en construcción 🚧 </h4> 

## Library Configurations and parameters

| Property                               | Description                                                        |
| -------------------------------------- | ------------------------------------------------------------------ |
| threshold                              | The threshold which means the max distance between non-equal pixels. Could be changed according size and requirements to the image. |
| rectangleLineWidth                     | Width of the line that is drawn the rectangle.                    |
| destination                            | File of the result destination.                                    |
| minimalRectangleSize                   | The number of the minimal rectangle size. Count as (width x height). By default it's 1. |
| maximalRectangleCount                  | Maximal count of the Rectangles, which would be drawn. It means that would get first x biggest rectangles. Default value is -1, that means that all the rectangles would be drawn. |
| pixelToleranceLevel                    | Level of the pixel tolerance. By default it's 0.1 -> 10% difference. The value can be set from 0.0 to 0.99. |
| excludedAreas                          | ExcludedAreas contains a List of Rectangles to be ignored when comparing images. |
| drawExcludedRectangles                 | Flag which says draw excluded rectangles or not.                  |
| fillExcludedRectangles                 | Flag which says fill excluded rectangles or not.                  |
| percentOpacityExcludedRectangles       | The desired opacity of the excluded rectangle fill.               |
| fillDifferenceRectangles               | Flag which says fill difference rectangles or not.                |
| percentOpacityDifferenceRectangles     | The desired opacity of the difference rectangle fill.             |
| allowingPercentOfDifferentPixels       | The percent of the allowing pixels to be different to stay MATCH for comparison. E.g. percent of the pixels, which would ignore in comparison. Value can be from 0.0 to 100.00 |
| differenceRectangleColor                | Rectangle color of image difference. By default, it's red.       |
| excludedRectangleColor                  | Rectangle color of excluded part. By default, it's green.        |

### Response type 
the implementation provides a response type to validate the result of the comparison, this response type is called *getImageComparisonState* and it can be the following states:
* MATCH : minds that the images are the same
* MISSMATCH : minds that the images are different
* SIZE_MISSMATCH : minds that the images have different size



## Collaborate with your team

- [ ] [Invite team members and collaborators](https://docs.gitlab.com/ee/user/project/members/)
- [ ] [Create a new merge request](https://docs.gitlab.com/ee/user/project/merge_requests/creating_merge_requests.html)
- [ ] [Automatically close issues from merge requests](https://docs.gitlab.com/ee/user/project/issues/managing_issues.html#closing-issues-automatically)
- [ ] [Enable merge request approvals](https://docs.gitlab.com/ee/user/project/merge_requests/approvals/)
- [ ] [Automatically merge when pipeline succeeds](https://docs.gitlab.com/ee/user/project/merge_requests/merge_when_pipeline_succeeds.html)

## Test and Deploy

Use the built-in continuous integration in GitLab.

- [ ] [Get started with GitLab CI/CD](https://docs.gitlab.com/ee/ci/quick_start/index.html)
- [ ] [Analyze your code for known vulnerabilities with Static Application Security Testing(SAST)](https://docs.gitlab.com/ee/user/application_security/sast/)
- [ ] [Deploy to Kubernetes, Amazon EC2, or Amazon ECS using Auto Deploy](https://docs.gitlab.com/ee/topics/autodevops/requirements.html)
- [ ] [Use pull-based deployments for improved Kubernetes management](https://docs.gitlab.com/ee/user/clusters/agent/)
- [ ] [Set up protected environments](https://docs.gitlab.com/ee/ci/environments/protected_environments.html)

***

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Authors and acknowledgment

| [<img src="https://gitlab.com/uploads/-/system/user/avatar/15033064/avatar.png?width=400" width=115><br><sub>Cristian F. Roa C.</sub>](https://gitlab.com/cristian.roa) <br/> |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|

## License
Open source project.

